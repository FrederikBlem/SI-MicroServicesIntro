package dk.fb.si.mystudentsassignmentservice.model;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data //Lombok, does getting and setting for you.
@Entity //Also Lombok
public class Assignment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long aid;
    String aname;
    int astudypoints;

    public Assignment()
    {
        super();
    }

}