package kz.oceandance.news.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.transition.MaterialSharedAxis
import kz.oceandance.common.base.BaseFragment
import kz.oceandance.common.ext.transitionSharedAxis
import kz.oceandance.news.databinding.FragmentNewsDetailBinding

class NewsDetailFragment : BaseFragment() {

    private lateinit var binding: FragmentNewsDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        transitionSharedAxis(MaterialSharedAxis.Z)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsDetailBinding.inflate(inflater, container, false);
        return binding.root
    }


}