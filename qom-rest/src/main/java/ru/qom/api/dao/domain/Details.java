package ru.qom.api.dao.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ru.qom.api.dao.domain.enums.DataType;

import javax.persistence.*;
import java.util.Map;

import static com.google.common.collect.Maps.immutableEntry;

/**
 * Created by isa on 05.09.2015.
 */
@JsonIgnoreProperties(value = "account")
@MappedSuperclass
public abstract class Details {
    @Id
    @GeneratedValue
    protected Long id;

    @ManyToOne
    protected Account account;

    @Enumerated(EnumType.STRING)
    @Column(name = "DATA_TYPE")
    protected DataType type;

    @Column(name = "VALUE")
    protected String value;

    @Column(name = "NAME")
    protected String name;

    public Details() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValueAsObject() {
        Object object;
        if (value == null) {
            return value;
        }
        if (type.equals(DataType.NUMBER)) {
            object = Integer.valueOf(Integer.parseInt(value));
        } else if (type.equals(DataType.BOOL)) {
            object = Boolean.valueOf(Boolean.parseBoolean(value));
        } else {
            object = value;
        }
        return object;
    }

    public void setValueAsObject(Object object) {
        if (object instanceof Number) {
            setType(DataType.NUMBER);
            setValue(Integer.toString(((Integer) object).intValue()));
        } else if (object instanceof Boolean) {
            setType(DataType.BOOL);
            setValue(Boolean.toString(((Boolean) object).booleanValue()));
        } else {
            setType(DataType.STRING);
            setValue((String) object);
        }
    }

    public Map.Entry<String, String> getAsKeyValue() {
        return immutableEntry(name, value);
    }
}
