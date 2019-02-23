package pl.sdacademy.springDI.beans;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GarageService {

    private Worker worker;

    public Worker getWorker() {
        return worker;
    }

    @Autowired
    public void setWorker (@Qualifier ("mechanic") Worker worker) {
        this.worker = worker;
    }
}
