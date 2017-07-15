package com.todo.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.ToString;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Document
@ToString
public class User {

    @Id
    private String id;

    @Field
    @NotNull
    private String name;

    @Field
    private String surname;

    @Field
    @NotNull
    private String mail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public static class Builder {

        private String name;
        private String surname;
        private String mail;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public User build() {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setName(name);
            user.setSurname(surname);
            user.setMail(mail);
            return user;
        }
    }
}
