@RestController
public class Controller {

    @Autowire
    Service service;

    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    @PostMapping("/addEmployee")
    Employee employee(@RequestBody Employee employee) {
        Employee employee1 = service.storeEmployee();
        return employee1;
    }

    @GetMapping("/getTaxDeduction/{id}")
    Employee employee(@PathVariable id) {
        Employee
    }
}