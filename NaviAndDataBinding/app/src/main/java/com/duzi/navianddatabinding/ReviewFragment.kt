package com.duzi.navianddatabinding


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_review.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ReviewFragment : Fragment() {

    val args: ReviewFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_review, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnBackDetail.setOnClickListener {
            findNavController().popBackStack()
        }

        btnBackHome.setOnClickListener {
            val action =
                ReviewFragmentDirections.actionReviewFragmentToHomeTabFragment()

            // app:popUpTo="@+id/homeTabFragment"
            // app:popUpToInclusive="true"
            // Home으로 가면서 사이에 거친 fragment를 전부 지움
           findNavController().navigate(action)
        }
    }

}
