package com.house_db.persistence.entities;

import com.house_db.persistence.exceptions.TypeNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "controller_type")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ControllerType {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    public static final ControllerType LOCK_CONTROLLER = new ControllerType(0L, "lock");
    public static final ControllerType LIGHT_BULB_CONTROLLER = new ControllerType(1L, "light_bulb");
    public static final ControllerType SOCKET_CONTROLLER = new ControllerType(2L, "socket");

    public static ControllerType of(Long typeId) {
        return values().stream().filter(item -> item.getId().equals(typeId)).findFirst().orElseThrow(() -> new TypeNotFoundException(typeId.toString()));
    }

    private static List<ControllerType> values() {
        return Arrays.asList(LOCK_CONTROLLER, LIGHT_BULB_CONTROLLER, SOCKET_CONTROLLER);
    }
}
