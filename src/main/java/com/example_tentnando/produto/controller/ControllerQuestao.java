package com.example_tentnando.produto.controller;

import com.example_tentnando.produto.dto.QuestaoDto;
import com.example_tentnando.produto.entities.Questao;
import com.example_tentnando.produto.service.ServiceQuestao;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Questao")
public class ControllerQuestao {
    //I.D I.C
    final ServiceQuestao serviceQuestao;
        public ControllerQuestao (ServiceQuestao service){
            this.serviceQuestao = service;
        }

        @PostMapping
            public ResponseEntity<Object> saveQuestao(@RequestBody QuestaoDto questaoDto){
            Questao questao = new Questao();
            BeanUtils.copyProperties(questaoDto, questao);
            return ResponseEntity.status(HttpStatus.CREATED).body(serviceQuestao.saveQuestao(questao));
        }

        @GetMapping
            public ResponseEntity<Object> getallQuestao(){
            return ResponseEntity.status(HttpStatus.OK).body(serviceQuestao.findall());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Object> getOne(@PathVariable(value = "id")UUID id){
            Optional<Questao> questaoOptional = serviceQuestao.findbyid(id);
            if(!questaoOptional.isPresent()){//verifica se ha um id correspondente no banco
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Questão não encontrado");
            }
            return ResponseEntity.status(HttpStatus.OK).body(questaoOptional.get());
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id")UUID id){

        Optional<Questao> questaoOptional = serviceQuestao.findbyid(id);
        if (!questaoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Questão não encontrado");
        }
        serviceQuestao.delete(questaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto apagado com sucesso");
    }
    /*
     @PutMapping("/{id}")
            public ResponseEntity<Object> updateProd(@PathVariable(value = "id")UUID id,
                                                 @RequestBody Produtodto produtodto){
            Optional<Produto> produtoOptional = serviceProduto.findbyid(id);
            if (!produtoOptional.isPresent()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não enccontrado");
            }
            var produtoup = new Produto();
            BeanUtils.copyProperties(produtodto, produtoup);
            produtoup.setId(produtoOptional.get().getId());
            return ResponseEntity.status(HttpStatus.OK).body(serviceProduto.saveprod(produtoup));
        }
    */
}
