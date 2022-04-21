package kz.oceandance.news.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kz.oceandance.common.base.BaseFragment
import kz.oceandance.common.base.NavigationCommand
import kz.oceandance.common.utils.EventWrapper
import kz.oceandance.news.databinding.FragmentNewsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsFragment : BaseFragment() {

    private lateinit var binding: FragmentNewsBinding
    private val viewModel: NewsViewModel by viewModel()

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

        viewModel.navigation.observe(viewLifecycleOwner, ::handleNavigation)

        binding.nextButton.setOnClickListener {
            viewModel.navigate(NewsFragmentDirections.actionNewsFragmentToNewsNavGraph())
        }

    }

    private fun handleNavigation(eventWrapper: EventWrapper<NavigationCommand>?) {
        eventWrapper?.getContentIfNotHandled()?.let { command ->
            when (command) {
                is NavigationCommand.To -> findNavController().navigate(command.directions, getExtras())
                is NavigationCommand.Back -> findNavController().navigateUp()
            }
        }
    }
}