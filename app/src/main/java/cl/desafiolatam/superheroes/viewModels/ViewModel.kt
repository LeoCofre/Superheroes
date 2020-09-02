package cl.desafiolatam.superheroes.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import cl.desafiolatam.superheroes.model.Repository

class ViewModel(application: Application) : AndroidViewModel(application){

    private var repository = Repository(application)

}