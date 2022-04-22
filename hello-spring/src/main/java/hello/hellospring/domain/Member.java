package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id//PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 알아서 생성 아이덴티티
    private Long id; //시스템이 정하는 id

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
