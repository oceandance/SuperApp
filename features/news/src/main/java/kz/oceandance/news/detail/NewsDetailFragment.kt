package kz.oceandance.news.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.oceandance.common.base.BaseFragment
import kz.oceandance.news.databinding.FragmentNewsDetailBinding

class NewsDetailFragment : BaseFragment() {

    private lateinit var binding: FragmentNewsDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsDetailBinding.inflate(inflater, container, false);
        return binding.root
    }


}