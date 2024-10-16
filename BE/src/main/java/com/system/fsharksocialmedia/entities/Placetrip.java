package com.system.fsharksocialmedia.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PLACETRIPS")
public class Placetrip {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLACEID")
    private Place placeid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRIPID")
    private Trip tripid;

    @Column(name = "DATETIME")
    private Instant datetime;

    @Size(max = 500)
    @Nationalized
    @Column(name = "NOTE", length = 500)
    private String note;

}