package uk.co.rorschach

/**
 * Retrieve the penultimate item from a list.
 */
object Problem2 {
  def pen[A](list: List[A]): A = list match {
    case h :: _ :: Nil => h
    case _ :: tail => pen(list)
    case _ => throw new NoSuchElementException
  }
}