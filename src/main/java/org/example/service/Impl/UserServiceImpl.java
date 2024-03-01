package org.example.service.Impl;

import lombok.RequiredArgsConstructor;
import org.aspectj.apache.bcel.classfile.Module;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;

   protected final ModelMapper mapper;
   @Override
    public List<UserEntity> getAllUsers() {
      return repository.findAll();
    }

    @Override
    public void addUser(User user) {
      UserEntity entity = mapper.map(user,UserEntity.class);
      repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);

    }

    @Override
    public User findByUsername(String username) {
      return mapper.map(repository.findByUsername(username),User.class) ;
    }

    @Override
    public Boolean isExistsUser(String username) {
   return repository.existsByUsername(username);

   }
}
