package co.com.certificacion.serempre.StellaArtois.stepdefinitions;

import co.com.certificacion.serempre.StellaArtois.tasks.AbrirNavegador;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.certificacion.serempre.StellaArtois.util.Constantes.ACTORAUTO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProbandoStellaArtois
{
    @Dado("^que quiero abrir el navegador y quiero entrar a Stella Artois$")
    public void queQuieroAbrirElNavegadorYQuieroEntrarAStellaArtois()
    {
        theActorCalled(ACTORAUTO).wasAbleTo(AbrirNavegador.enStellaAitors());
    }

    @Cuando("^busco una cerveza en esta pagina$")
    public void buscoUnaCervezaEnEstaPagina()
    {

    }

    @Entonces("^verifico que si tengo la cerveza que queria$")
    public void verificoQueSiTengoLaCervezaQueQueria()
    {

    }


}
