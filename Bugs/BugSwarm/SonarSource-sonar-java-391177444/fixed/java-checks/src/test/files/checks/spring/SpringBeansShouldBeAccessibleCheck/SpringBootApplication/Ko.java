package foo.bar.Ko;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RestController;

// Different from root package hierarchy

@Component
class Ko1 {} // Noncompliant

@Service
class Ko2 {} // Noncompliant

@Controller
class Ko3 {} // Noncompliant

@RestController
class Ko4 {} // Noncompliant
