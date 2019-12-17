package domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="POJO_TABLE")
public class Pojo {
    @SequenceGenerator(name = "seq", sequenceName = "POJO_TABLE_ID_SEQ",allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    private long id;

    @Column(name="ISIM", length = 100)
    private String adi;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date islemTarihi;

    public Date getIslemTarihi() {
        return islemTarihi;
    }

    public void setIslemTarihi(Date islemTarihi) {
        this.islemTarihi = islemTarihi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
