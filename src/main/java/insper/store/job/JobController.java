package insper.store.job;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-job")
public interface JobController {

    @PostMapping("/jobs")
    public ResponseEntity<JobOut> create(
        @RequestBody(required = true) JobIn in
    );

    // @PostMapping("/Jobs/login")
    // public ResponseEntity<JobOut> login(
    //     @RequestBody(required = true) LoginIn in
    // );

    @PutMapping("/jobs/{id}")
    public ResponseEntity<JobOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) JobIn in
    );

    @GetMapping("/jobs")
    public ResponseEntity<JobOut> read(
        @RequestHeader(required = true, name = "id-job") String idJob
    );
    
}