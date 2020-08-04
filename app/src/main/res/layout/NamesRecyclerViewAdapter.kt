package layout

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import kotlinx.android.synthetic.main.activity_main.view.*

class NamesRecyclerViewAdapter {
    val namesList: List<String>

};
       RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>(){

    override fun  onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewsHolder{
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesLists.size
    }
    override fun onBlindViewHolder(holder: NamesViewHolder position: Int){
        holder.rowView.recyclerView_main.text = namesList(position)
        holder.rowView.recyclerView_main.text = recycle.name
        holder.rowView.recyclerView_main.text = recycle.age
        holder.rowView.recyclerView_main.text = recycle.DOB
        holder.rowView.recyclerView_main.text = recycle.hobby
    }
    class NamesViewHolder(val rowView: View): RecyclerView.ViewHolder(rowView)
}