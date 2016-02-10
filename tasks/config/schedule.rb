# Use this file to easily define all of your cron jobs.
#
# It's helpful, but not entirely necessary to understand cron before proceeding.
# http://en.wikipedia.org/wiki/Cron

# Example:
#
set :output, {:error => 'error.log', :standard => 'cron.log'}

# Learn more: http://github.com/javan/whenever
set :environment_variable, 'EP_LOG_DIR'
set :environment, ENV['EP_LOG_DIR']

every 6.hour do
  rake "scheduled:handle_denormalizer"
end
