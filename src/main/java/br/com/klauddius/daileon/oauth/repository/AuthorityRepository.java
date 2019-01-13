package br.com.klauddius.daileon.oauth.repository;

import br.com.klauddius.daileon.oauth.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);

}
