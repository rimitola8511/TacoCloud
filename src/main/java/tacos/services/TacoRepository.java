package tacos.services;

import tacos.domain.Taco;

public interface TacoRepository {

    Taco save(Taco taco);
}
