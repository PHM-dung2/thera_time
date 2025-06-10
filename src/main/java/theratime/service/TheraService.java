package theratime.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import theratime.model.repository.TheraRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class TheraService {
    private final TheraRepository theraRepository;

}
