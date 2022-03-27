package kz.oceandance.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.oceandance.common.base.BaseFragment
import kz.oceandance.common.utils.DateHelper
import kz.oceandance.news.databinding.FragmentNewsBinding
import java.util.*

class NewsFragment : BaseFragment() {

    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calendar = GregorianCalendar.getInstance()
        val dateHelper = DateHelper.getRelativeDate(calendar.time)
        binding.currentTimeTextView.text = dateHelper
    }
}