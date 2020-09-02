package cl.desafiolatam.superheroes.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.desafiolatam.superheroes.R
import cl.desafiolatam.superheroes.model.dataclass.Superheroes
import java.util.ArrayList

class HeroesListAdapter : RecyclerView.Adapter<HeroesListAdapter.ViewHolder>() {

    var items: ArrayList<Superheroes>? = null
    var viewHolder: ViewHolder? = null

    init {
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesListAdapter.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)

        viewHolder = ViewHolder(vista)

        return viewHolder!!
    }

    override fun onBindViewHolder(holder: HeroesListAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return this.items?.count()!!
    }

    class ViewHolder(vista : View): RecyclerView.ViewHolder(vista) {
        var vista = vista

    }


}
