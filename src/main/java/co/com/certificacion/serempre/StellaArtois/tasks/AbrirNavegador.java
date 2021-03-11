package co.com.certificacion.serempre.StellaArtois.tasks;

import co.com.certificacion.serempre.StellaArtois.userinterface.EntrarPaginaWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task
{

    private EntrarPaginaWeb entrarPaginaWeb;

    public static AbrirNavegador enStellaAitors()
    {
        return Tasks.instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(entrarPaginaWeb));
    }
}
