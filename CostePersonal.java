public class CostePersonal {

        static float CosteDelPersonal(Trabajador trabajadores[]) {
                float costeFinal = 0;
                trabajador TRABAJADOR;
                for (int i = 0; i < trabajadores.length; i++) {
                        TRABAJADOR = trabajadores[i];
                        if (TRABAJADOR.getTipotrabajador() == trabajador.DIRECTOR|| trabajador.getTipotrabajador() == trabajador.SUBDI>
                                        costeFinal += TRABAJADOR.getNomina();
                        }
                        else
                        {
                                costeFinal += TRABAJADOR.getNomina() + (TRABAJADOR.getHorasExtras() * 20);
                        }
                }
                return costeFinal;
        }
}

