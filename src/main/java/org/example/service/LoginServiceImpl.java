package org.example.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.Login;
import org.example.entity.LoginEntity;
import org.example.repository.LoginRepository;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class LoginServiceImpl implements LoginService{
    final LoginRepository repository;
    final ModelMapper mapper;
    @Override
    public void insertLoginData(Login login) {
        repository.save(mapper.map(login, LoginEntity.class));
    }

    @Override
    public Boolean validateLogin(Login login) {
        System.out.println(login.toString());
        log.info(login.toString());
        return repository.existsByEmailAndPassword(login.getEmail(), login.getPassword());
    }
}
