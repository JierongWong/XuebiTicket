JsonService统领各个service


@Service
public class JsonService {

	@Autowired
	private MovieService movieService;
	@Autowired
	private CinemaService cinemaService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private UserService userService;
        ……
}