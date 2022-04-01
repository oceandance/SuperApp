package kz.oceandance.news.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kz.oceandance.news.R
import kz.oceandance.news.databinding.FragmentNewsBinding
import kz.oceandance.news.databinding.FragmentNewsDetailBinding

class NewsDetailFragment: Fragment(R.layout.fragment_news_detail) {

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