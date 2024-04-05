package com.ceva.spring6.six.repo;

import com.ceva.spring6.six.plain.records.Singer;

import java.util.List;
import java.util.Optional;
public interface SingerRepo {
    List<Singer> findAll();
    List<Singer> findByFirstName(String firstName);
    String findNameById(Long id);
    Optional<String> findLastNameById(Long id);
    Optional<String> findFirstNameById(Long id);
    List<Singer> findAllWithAlbums();

    void insert(Singer singer);
    void update(Singer singer);
    void delete(Long singerId);
    void insertWithAlbum(Singer singer);
}
