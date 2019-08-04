package com.duzi.navianddatabinding


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_home_detail.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeDetailFragment : Fragment() {

    private val args: HomeDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        args.let {
            contents.text = "HomeDetailFragment : ${it.productId}"
        }

        btnBackHome.setOnClickListener {
            findNavController().popBackStack()
        }

        btnGoReview.setOnClickListener {
            val productId = "pro1"
            val action =
                HomeDetailFragmentDirections.actionHomeDetailFragmentToReviewFragment(productId)

            findNavController().navigate(action)
        }
    }

}
