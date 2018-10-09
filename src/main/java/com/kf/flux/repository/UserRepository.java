package com.kf.flux.repository;

import com.kf.flux.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.flux.repository
 * @Description: TODO
 * @date 2018/10/9 下午4:08
 */
public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Mono<User> findByUsername(String username);
    Mono<Long> deleteByUsername(String username);
}
